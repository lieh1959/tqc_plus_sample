/* TQC+ JAVA6 - 607_3 */

public class JPA06_3 {
    public static void main(String[] arge){

        int[][] n ={
            {120,420,315,250,418,818,900},
            {312,183,215,89,83,600,700},
            {215,500,430,210,300,918,880}
        };
        String[] nn={"�_��","����","�n��"};

        System.out.println("\n\t  �Ĥ@�q����ޤ��q�g���� ( �� �� : �U �� ) ");
        System.out.println( "���穱 \t �@ \t �G \t �T \t �| \t �� \t�� \t �� \t  ");
        System.out.println( "=====\t====\t====\t====\t====\t====\t====\t====");
        //�D�n�O�ϥΨ�h��for loop�A�Ĥ@�h�D�n�O��ܰϰ�A�ĤG�h����`��~�B
        for(int a=0;a<3;a++){
            System.out.print(nn[a]+"\t");
            for(int b=0;b<7;b++){
                System.out.print(n[a][b]+"\t");
            }
            System.out.println("");
        }
    }
}
