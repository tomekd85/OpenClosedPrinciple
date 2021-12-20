package org.tedeo.pdfview;

public class PdfView {

    private long revenue;

    public PdfView(long revenue) {
        this.revenue = revenue;
    }

    public void load(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "PdfView{" +
                "revenue=" + revenue +
                '}';
    }
}
