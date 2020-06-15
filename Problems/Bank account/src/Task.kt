// write the BankAccount class here
class BankAccount {
    var deposited: Long = 0
    var withdrawn: Long = 0
    var balance: Long = 0

    constructor(deposited: Long, withdrawn: Long) {
        this.deposited = deposited
        this.withdrawn = withdrawn
        balance = deposited - withdrawn
    }
}