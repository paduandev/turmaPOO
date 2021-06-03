package exemplos;

/*

Exemplo de aplicação dentro da estrutura de dados PILHA
(Apenas um recorte para explicar, não está completo. Fica como exercício aplicar na pilha completa)

*/

public class Exemplo04 {
    public static void main(String[] args) {
        try {
            pop();
        } catch (Exception e) {
            System.out.println("Piha Vazia!");
        }
        
    }

    static int pop() throws Exception {
        if(isEmpty()){
            throw new Exception();
        }
        return v[top--];
    }


}
