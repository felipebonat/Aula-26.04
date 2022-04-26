public class IMC {
    
    double indice;
    boolean abaixoDoPeso;
    boolean pesoIdeal;
    boolean obeso;
    String grauObesidade;
    
    @Override
    public String toString() {
        return "IMC [abaixoDoPeso=" + abaixoDoPeso + ",\n grauObesidade=" + grauObesidade + ",\n indice=" + indice
                + ",\n obeso=" + obeso + ",\n pesoIdeal=" + pesoIdeal + "]";
    }

}
