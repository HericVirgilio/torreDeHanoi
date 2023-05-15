import java.util.Stack;
public class main {
    public static void torreDeHanoi(int n, Stack<Integer> inicio, Stack<Integer> destino,Stack<Integer> auxiliar){
        if(n > 0){
            torreDeHanoi(n - 1,inicio,auxiliar,destino);
            destino.push(inicio.pop());
            System.out.println("------");
            System.out.println("Inicio: " + inicio);
            System.out.println("Destino: " + destino);
            System.out.println("Auxiliar: " + auxiliar);
            torreDeHanoi(n - 1,auxiliar,destino,inicio);
        }
    }
    public static void main(String[] args) {
            Stack<Integer> inicio = new Stack<>();
            Stack<Integer> destino = new Stack<>();
            Stack<Integer> auxiliar = new Stack<>();

            inicio.push(3);
            inicio.push(2);
            inicio.push(1);
            torreDeHanoi(inicio.size(),inicio,destino,auxiliar);

    }
}
