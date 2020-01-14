var Employeee = function () {
    this.setSelary = function (selary) {
        this.selary = selary;
    };
    this.getSelary = function () {
        return this.selary;
    };
    this.setWordday = function (wordday) {
        this.wordday = wordday;
    };
    this.getWordday = function () {
        return this.wordday;
    }
    this.getTotalSalary = function () {
        return this.selary*this.wordday;
    }
};