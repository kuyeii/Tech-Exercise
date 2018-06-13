$("#cancel").click(function () {
    gotoIndex();
});

$("#submit").click(function () {
    var name = $("#name").val();
    var telephone = $("#telephone").val();
    if (name == null || name === "") {
        alert("name can't be empty !");
        return;
    }
    if (telephone == null || telephone === "") {
        alert("telephone can't be empty !");
        return;
    }
    console.log(name);
    console.log(telephone);
    save(name, telephone);
});

function save(name, telephone) {
    $.get("save", {"name": name, "telephone": telephone}, function () {
        gotoIndex();
    });
}

function gotoIndex() {
    window.location.href = "/";
}