import groovy.util.GroovyTestCase
class BankAccountTests extends GroovyTestCase{
    def void testcaseCanDepositMoney(){
        def account = new BankAccount(1000)
        account.deposit(500)
        //assert 1500 = account.value
    }
}
