var inpName = document.getElementById("name");
var address = document.getElementById("address");
var selary = document.getElementById("selary");
var wordday = document.getElementById("wordday");
var arrProduct = [];

function addCustomer() {
    var customer = new Customer();
    customer.setName(inpName.value);
    customer.setAddress(address.value);
    arrProduct.push(customer);
    show();
}
function addEmploy() {
    var employee = new Employeee();
    customer.setSelary(selary.value);
    customer.setWordday(wordday.value);
    arrProduct.push(employee);
    show();
}
function show() {
    var drawTable = "<tr><th>Name</th>\n" +
        "<th>Address</th>\n" +
        "<th>Selary</th>\n" +
        "<th>Wordday</th>\n" +
        "<th>Action</th>\n" +
        "</tr>";
    for(var i = 0 ; i < arrProduct.length; i++){
        drawTable += "<tr>" +
            "<td>"+ arrProduct[i].getName()  + "</td>" +
            "<td>"+ arrProduct[i].getAddress() +"</td>" +
            "<td>" + arrProduct[i].getSelary() + "</td>" +
            "<td>"+ arrProduct[i].getWordday() +"</td>" +
            "<td><button onclick='deleteProduct("+ i +")'>Remove</button></td>" +
            "</tr>"
    }
    alert(drawTable);
    tableProduct.innerHTML = drawTable;
}