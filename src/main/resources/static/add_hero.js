function getFamilyByPattern() {
    var pattern = document.getElementById('family_name').value;
    if (pattern.length != 0) {
        $.ajax({
                url: "http://192.168.0.10:8080/rest/family/get/" + pattern,
                method: "GET"
            })
            .done(response => {
                var dataList = $("#search_family");
                var familyId = $("#family_id");
                dataList.empty();
                for(let i = 0; i < response.length; i++) {
                    if(pattern != response[i].name){
                        dataList.append($("<option></option>").attr("value", response[i].name));
                    } else {
                        familyId.attr("value", response[i].id);
                    }
                }
            })
    }
}

function getClassByPattern() {
    var pattern = document.getElementById('hero_class').value;
    if (pattern.length != 0) {
        $.ajax({
                url: "http://192.168.0.10:8080/rest/hero/class/get/" + pattern,
                method: "GET"
            })
            .done(response => {
                var dataList = $("#search_class");
                var familyId = $("#class_id");
                dataList.empty();
                for(let i = 0; i < response.length; i++) {
                    if(pattern != response[i].name){
                        dataList.append($("<option></option>").attr("value", response[i].name));
                    } else {
                        familyId.attr("value", response[i].id);
                    }
                }
            })
    }
}

function clearInt() {
    $("#power").attr("value", "");
    $("#team_cost").attr("value", "");
    $("#charge_speed").attr("value", "");
    $("#stars").attr("value", "");
}

