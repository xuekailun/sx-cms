function toSub(){
    var text = $(".summernote").code();
    var wcid = $("#wId").val();
    var title = $("#title").val();
    var gjc = $("#gjc").val();
    var author = $("#author").val();

    var url = "modification";


    var reqBody = {
        title: title,
        content: text,
        keyword: gjc,
        author: author,
        wcid: wcid
    }

    $.ajax({
        type: "POST",
        url: url,
        contentType: "application/json",
        dataType: "text",
        data:  JSON.stringify(reqBody),
        success: function (data) {
            var jsonData = JSON.parse(data);
            debugger
            if(jsonData.status == 200){
                window.location.href = "list";
            }
        }
    });

}


function toDelete(item,index){
    var url = "delete?id="+item;
    $.ajax({
        type: "GET",
        url: url,
        dataType: "json",
        success: function (data) {
            debugger
            if(data.status == 200){
                // layer.alert("删除成功");
                layer.close(index);
                window.location.href = "list";
            }
        }
    });
}


function YqtoUpdate(){
    var id = $("#yqId").val();
    var name = $("#yqName").val();
    var path = $("#yqPath").val();
    var show = $("#yqShow").val();
    var imgurl =$("#logoimg")[0].src;
    var memo = $("#yqmemo").val();
    var reqBody = {
        id: id,
        name: name,
        url: path,
        isshow: show,
        logoimg: imgurl,
        memo:memo
    }

    var url = "/cms/fl/update";

    $.ajax({
        type: "POST",
        url: url,
        contentType: "application/json",
        dataType: "text",
        data:  JSON.stringify(reqBody),
        success: function (data) {
            var jsonData = JSON.parse(data);
            debugger
            if(jsonData.status == 200){
                window.location.href = "/cms/fl/list";
            }
        }
    });

}


function toWebSiteUpdate(){

    var id = $("#zdId").val();
    var name = $("#zdName").val();
    var keyword = $("#zdkeyWord").val();
    var memo = $("#zdmemo").val();
    var reqBody = {
        id: id,
        title: name,
        keyword: keyword,
        depict: memo
    }

    var url = "/cms/ws/update";

    $.ajax({
        type: "POST",
        url: url,
        contentType: "application/json",
        dataType: "text",
        data:  JSON.stringify(reqBody),
        success: function (data) {
            var jsonData = JSON.parse(data);
            debugger
            if(jsonData.status == 200){
                window.location.href = "/cms/ws/list";
            }
        }
    });

}