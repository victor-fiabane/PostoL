
package postol;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class PostoL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Um posto está vendendo combustíveis com a seguinte tabela de descontos,
        Crie um algoritmo que leia a quantidade de combustível que um cliente
        abastece, com base no valor do combustível - calcule o total abastecido
        e de acordo com a regra abaixo calcule o valor final que o cliente deverá
        pagar, ou seja com os devidos desconto de acordo com a tabela abaixo.
Valor da Gasolina é R$ 5,84 e o valor do Álcool é R$ 4,90
Álcool à Até 25 litros, desconto de 2% por litro Acima de 25 litros, desconto de 4% por litro;
Gasolina  à Até 25 litros, desconto de 3% por litro Acima de 25 litros, desconto de 5% por litro.
Mostre no final o total de litros abastecido, o valor sem desconto e o valor com desconto;*/
        double gasVal, alcVal, gasL, alcL, tot1, tot2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos litros de Gasolina você deseja comprar?");
        gasL = teclado.nextDouble();
        System.out.println("Quantos litros de Álcool você deseja comprar?");
        alcL = teclado.nextDouble();
        gasVal = 5.84; alcVal = 4.90; tot1 = 0; tot2 = 0;
        if(alcL > 0 && alcL <= 25){
            tot1 = (alcL * alcVal) % 0.02;
            tot2 = (alcL * alcVal) % 0.04;
        }else if(alcL > 25){
            tot1 = (alcL * alcVal) % 0.02;
            tot2 = (alcL * alcVal) % 0.04;
        }
        if(gasL > 0 && gasL <= 25){
            tot1 = (gasL * gasVal) % 0.03;
            tot2 = (gasL * gasVal) % 0.5;
        }else if(gasL > 25){
            tot1 = (gasL * gasVal) % 0.03;
            tot2 = (gasL * gasVal) % 0.05;
        }
        System.out.println("Você abasteceu seu carro com sucesso, o valor sem "
                + "desconto é de R$"+tot1+" e o valor com desconto é de R$"+tot2);
    }
    
}
