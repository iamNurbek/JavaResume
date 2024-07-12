import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;

public class PDFGenerator {

    public static void generatePDF(String name, String email, String phone, String education, String experience) {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);

            PDPageContentStream contentStream = new PDPageContentStream(document, page);
            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
            contentStream.beginText();
            contentStream.setLeading(14.5f);
            contentStream.newLineAtOffset(25, 700);
            contentStream.showText("Name: " + name);
            contentStream.newLine();
            contentStream.showText("Email: " + email);
            contentStream.newLine();
            contentStream.showText("Phone: " + phone);
            contentStream.newLine();
            contentStream.showText("Education: " + education);
            contentStream.newLine();
            contentStream.showText("Experience: " + experience);
            contentStream.endText();
            contentStream.close();

            document.save("Resume.pdf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
