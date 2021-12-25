public class Preguntas {
    private String pregunta;
    private Respuestas[] respuesta;

    public Preguntas(String pregunta, Respuestas[] respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }
    public void imprimir(){
        System.out.println(this.pregunta);
        System.out.println(this.respuesta);
        for ()
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public Respuestas[] getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Respuestas[] respuesta) {
        this.respuesta = respuesta;
    }
}
