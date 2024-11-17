package Exercises5;

import java.util.Scanner;
public class ppt{
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        int piedra = 1;
        int papel = 2;
        int tijeras = 3;
        int lagarto = 4;
        int spock = 5;
        int n;

        int num = (int) (Math.random() * 3+1);

        
        System.out.printf("Elije entre Piedra(1), Papel(2), Tijeras(3), Lagarto(4), Spock(5): ");
        n = sc.nextInt();
        System.out.println("Yo saco " + num);

        if(num > 5 || num < 1){
            System.out.println("Elije otro número");
        }else{
            while(n == 1){
                if(num == 1){
                    System.out.println("Empate, otra vez");
                }else if(num == 2){
                    System.out.println("Tú ganas");
                }else if(num == 3){
                    System.out.println("Yo gano");
                }else if(num == 4){
                    System.out.println("Yo gano");
                }else if(num == 5){
                    System.out.println("Tú ganas");
                }
                break;
            }
                while(n == 2){
                    if(num == 1){
                    System.out.println("Yo gano");
                    }else if(num == 2){
                    System.out.println("Empate, otra vez");
                    }else if(num == 3){
                    System.out.println("Tú ganas");
                    }else if(num == 4){
                    System.out.println("Tú ganas");
                    }else if(num == 5){
                    System.out.println("Yo gano");
                }
                break;
            }
                while(n == 3){
                if(num == 1){
                    System.out.println("Tú ganas");
                }else if(num == 2){
                    System.out.println("Yo gano");
                }else if(num == 3){
                    System.out.println("Empate, otra vez");
                }else if(num == 4){
                    System.out.println("Yo gano");
                }else if(num == 5){
                    System.out.println("Tú ganas");
                }
                break;
            }
                while(n == 4){
                if(num == 1){
                    System.out.println("Tú ganas");
                }else if(num == 2){
                    System.out.println("Yo gano");
                }else if(num == 3){
                    System.out.println("Tú ganas");
                }else if(num == 4){
                    System.out.println("Empate, otra vez");
                }else if(num == 5){
                    System.out.println("Yo gano");
                }
                break;
            }
                while(n == 5){
                if(num == 1){
                    System.out.println("Yo gano");
                }else if(num == 2){
                    System.out.println("Tú ganas");
                }else if(num == 3){
                    System.out.println("Yo gano");
                }else if(num == 4){
                    System.out.println("Tú ganas");
                }else if(num == 5){
                    System.out.println("Empate, otra vez");
                }
                break;
            }
        }
    } 
}