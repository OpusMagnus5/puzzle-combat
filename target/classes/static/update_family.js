function getFamiliesByPattern() {
    var pattern = document.getElementById('search').value;
    $.ajax({
        url: "http://192.168.0.10:8080/rest/family/get/" + pattern,
        method: "GET"
    })
    .done(response => {
        var dataList = $("#search_list");
        dataList.empty();
        response.forEach(family => dataList
            .append($("<option></option>")
            .attr("value", family.name)));
    })
}