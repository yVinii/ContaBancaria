import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Autor: Vinicius
 */
public class Conta {

    /**
     * Configuração inicial para um cliente especial com saldo atual negativo.
     *
     * @param arg1 Saldo inicial do cliente especial (negativo)
     * @throws Throwable Exceção em caso de falha na execução do código de teste.
     */
    @Given("^Um cliente especial com saldo atual de -(\\d+) reais$")
    public void um_cliente_especial_com_saldo_atual_de_reais(int arg1) throws Throwable {
        // Código relacionado à configuração inicial do teste
        throw new PendingException();
    }

    /**
     * Define a ação de solicitar um saque em uma conta.
     *
     * @param arg1 Valor do saque solicitado
     * @throws Throwable Exceção em caso de falha na execução do código de teste.
     */
    @When("^for solicitado um saque no valor de (\\d+) reais$")
    public void for_solicitado_um_saque_no_valor_de_reais(int arg1) throws Throwable {
        // Código relacionado à ação de solicitar um saque
        throw new PendingException();
    }

    /**
     * Verifica se o saque foi efetuado corretamente e atualiza o saldo da conta.
     *
     * @param arg1 Novo saldo da conta após o saque
     * @throws Throwable Exceção em caso de falha na execução do código de teste.
     */
    @Then("^deve efetuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int arg1) throws Throwable {
        // Código relacionado à verificação do saque e atualização do saldo
        throw new PendingException();
    }

    /**
     * Verifica resultados adicionais após a operação de saque.
     *
     * @throws Throwable Exceção em caso de falha na execução do código de teste.
     */
    @Then("^check more outcomes$")
    public void check_more_outcomes() throws Throwable {
        // Código relacionado à verificação de resultados adicionais
        throw new PendingException();
    }
}