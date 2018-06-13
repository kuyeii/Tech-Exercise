getList();


$("#content").on('click', 'button', function () {
    var id = $(this).attr("data");
    $.get("delete", {"index": id}, function () {
        getList();
    })
});

function getList() {
    $.get("list", function (result) {
        if (result.length) {
            var html = "";
            for (var i = 0; i < result.length; i++) {
                var tele = result[i];
                html += "<tr><td>" + (i + 1) + "</td><td>" + tele.name + "</td><td>" + tele.telephone + "</td>" +
                    "<td><button style='font-size: 17px; border-radius: 3px; background: #e97767;" +
                    " color: #ffffff; cursor: pointer; border: none;' type='button' data='" + i + "'>delete</button></td></tr>";
            }
            html += "<tr><td colspan=\"4\"><a href='add'>Click Add Data</a></td></tr>";
            $("#content").html(html);
        } else {
            $("#content").html("<tr><td colspan=\"4\"><a href='add' style='color: red'>No Data，Click Add Data!</a></td></tr>");
        }
    });
}