function getHeroClassByPattern() {
    var pattern = document.getElementById('search').value;
    if (pattern.length != 0) {
        $.ajax({
                url: "http://192.168.0.10:8080/rest/hero/class/get/" + pattern,
                method: "GET"
            })
            .done(response => {
                var dataList = $("#search_list");
                dataList.empty();
                for(let i = 0; i < response.length; i++) {
                    if(pattern != response[i]){
                        dataList.append($("<option></option>").attr("value", response[i]));
                    }
                }
            })
    }

}