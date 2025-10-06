/*
 * Projeto.: Lista Simplesmente Ligada/Encadeada
 * Autor...: Professor Dreco
 * Classe..: Lse
 * Objetivo: Criação e manutenção dos elementos na lista simplesmente encadeada
 */
package lista;
import java.util.Scanner;

public class Lse
{
    // Objetivo: atributos de determinação do primeiro e do último elemento da
    //           lista, para que seja realizada a sua gestão
    //
    public Noh primeiro;
    public Noh ultimo;

    // Objetivo: método para receber e tratar a digitação de um atributo dados
    //           (do tipo Object) quando de uma inserção ou consulta por conteúdo
    //
    public String digitacao (String tipo)
    {
        Scanner s = new Scanner(System.in);
        String dados = " ";

        do
        {
            Msg.limpatela();

            try
            {
                Msg.msg_pl("Digite o ["+tipo+"] para o elemento - não pode ser vazio: ");
                dados = s.nextLine();
            }
            catch(Exception e)
            {
                Msg.msg_pl ("Erro de digitação, não deixe a informação ["+tipo+"] vazia:");
            }
        } while (dados.isEmpty());

        return dados;
    }


    // Objetivo: método para receber e tratar a digitação do atributo codigo
    //           quando de uma inserção ou consulta por conteúdo
    //
    public Integer D_Id ()
    {
        Msg.limpatela();
            
        Scanner s = new Scanner(System.in);
        Integer cod = 0;
        String texto = "Digite o valor para o Id do cliente (inteiro maior que zero): ";
        Integer erro = 0;

        do
        {
            try
            {
                Msg.msg_pl(texto);
                cod = Integer.parseInt(s.nextLine());
            }
            catch(Exception e)
            {
                texto = "Erro de digitação, o ID é obrigatório e inteiro maior que zero: ";
                erro = 1;
            }
            if((cod <= 0) && (erro == 0))
            {
                texto = "Erro de digitação, o ID é obrigatório e inteiro maior que zero: ";
            }
            erro = 0;
            Msg.limpatela();

        } while (cod <= 0);

        return cod;
    }

    // Objetivo: método para receber e tratar a digitação de um atributo dados
    //           Nome
    //
    public String D_Nome ()
    {
        Msg.limpatela();
            
        Scanner s = new Scanner(System.in);
        String nome = " ";
        String texto = "Digite o NOME do cliente (obrigatório): ";

        do
        {
            Msg.limpatela();

            try
            {
                Msg.msg_pl(texto);
                nome = s.nextLine();
            }
            catch(Exception e)
            {
                texto = "Erro de digitação, o NOME é obrigatório: ";
            }

            Msg.limpatela();
            
        } while (nome.isEmpty());

        return nome;
    }

    // Objetivo: método para receber e tratar a digitação do atributo sexo
    //           quando de uma inserção ou consulta por conteúdo
    //
    public Integer D_Sexo ()
    {
        Scanner s = new Scanner(System.in);
        int sexo  = 0;
        String texto = "Digite o valor para o SEXO do cliente (1.Mas 2.Fem): ";
        Integer erro = 0;

        do
        {
            Msg.limpatela();

            try
            {
                Msg.msg_pl(texto);
                sexo = Integer.parseInt(s.nextLine());
            }
            catch(Exception e)
            {
                texto = "Erro de digitação, o SEXO é obrigatório: ";
                erro = 1;
            }
            if((sexo < 1) || (sexo > 2) || (erro == 0))
            {
                texto = "Erro de digitação, o SEXO é obrigatório (1.Mas 2.Fem): ";
            }
            
            erro = 0;
        
            Msg.limpatela();

        } while ((sexo < 1) || (sexo > 2));

        return sexo;
    }

    // Objetivo: método para quantificar e informar a quantidade de
    //           elementos da lista, ou seja, seu tamanho
    //
    public int tamanho()
    {
        int t = 0;
        //
        // Aguarde a implementação do cálculo de tamanho da lista
        //
        return t;
    }

    // Objetivo: método para verificar se a lista está vazia (true)
    //           ou não (false)
    //
    public boolean vazia()
    {
        boolean r = true;

        if (this.primeiro != null)
        {
            r = false;
        }
        
        return r;
    }

    // Objetivo: método para inserir um novo elemento pos posição na lista
    //
    //
    public void inserir_posicao(int pos)
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE INSERÇÃO POR POSIÇÃO - Aguarde implementação");
    } 

    // Objetivo: método para remover um elemento por posição na lista
    //           
    //
    public void remover_posicao(int pos)
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE REMOÇÃO NO POSIÇÃO - Aguarde implementação");
    }

    // Objetivo: método para remover todos os elementos que estão
    //           presentes na lista, inicializando-a. Tornando-a vazia.
    //
    public void inicializar()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE INICIALIZAÇÃO - Aguarde implementação");
    }

    // Objetivo: método para consultar todos os elementos que estão
    //           presentes na lista
    //
    
    public void consultar_geral()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA GERAL - Aguarde implementação");
    }

    // Objetivo: método para consultar se uma determinada posição está
    //           presente na lista e, se sim, qual elemento a ocupa
    //
    public void consultar_posicao(int posicao)
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA POR POSIÇÃO - Aguarde implementação");
    }

    // Objetivo: método para consultar se um determinado elemento com conteúdo INT está
    //           presente na lista e, se sim, qual posição ele ocupa
    //
    public void consultar_conteudo_int(int conteudo)
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA POR CONTEÚDO - INT - Aguarde implementação");
    }

    // Objetivo: método para consultar se um determinado elemento com conteúdo STR está
    //           presente na lista e, se sim, qual posição ele ocupa
    //
    public void consultar_conteudo_str(String conteudo)
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA POR CONTEÚDO - STR - Aguarde implementação");
    }

    // Objetivo: método construtor da lista e que determina que ela
    //           está, inicialmente, vazia
    //
    public Lse()
    {
        this.primeiro = this.ultimo = null;
    }
}