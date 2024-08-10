public class Lista {
    public static void main(String[] args) throws Exception{
        Curso c1 = new Curso("imagen", "PyTorch Deep Learning Bootcamp", "Andrei Neagoie, Daniel Bourke", 4.6, "4.5/5", 2907, 12.99, 74.99, "Bestseller");
        Curso c2 = new Curso("imagen", "Machine Learning A-Z: AI, Python & R + ChatGPT Prize...", "Kirill Eremenko, Hadelin de Ponteves,...", 4.5, "4.5/5", 184477, 14.99, 84.99, "Bestseller");
        Curso c3 = new Curso("imagen", "Deep Learning: Advanced Computer Vision (GANs, SSD,...)", "Lazy Programmer Inc.", 4.6, "4.5/5", 6157, 14.99, 79.99, "-");
        Curso c4 = new Curso("imagen", "Applied Generative AI and Natural Language Processing", "Bert Gollnick", 4.7, "4.5/5", 66, 12.99, 54.99, "Hot & new");
        Recomendaciones recom = new Recomendaciones();
        recom.agregarCurso(c1);
        recom.agregarCurso(c2);
        recom.agregarCurso(c3);
        recom.agregarCurso(c4);
        recom.imprimir();
    }
}
