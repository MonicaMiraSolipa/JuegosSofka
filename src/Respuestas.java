public class Respuestas {
    private String respuesta;
    private int numero;
    private boolean esCorrecta;

    public Respuestas(String respuesta, int numero, boolean esCorrecta) {
        this.respuesta = respuesta;
        this.numero = numero;
        this.esCorrecta = esCorrecta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isEsCorrecta() {
        return esCorrecta;
    }

    public void setEsCorrecta(boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }
}
