function toSub(){
console.log("---")
    debugger
    //上级栏目ID
    var pid = $("#pid").val();
    //栏目名称
    var lmName = $("#lmName").val();
    //栏目模型
    var lmModel = $("#lmModel").val();
    //访问路径
    var lmPath = $("#lmPath").val();
    //是否显示
    var lmShow = $("#lmShow").val();

    var url = "/column/increases";

    var reqBody = {
        wName: lmName,
        wPid: pid,
        wPath: lmPath,
        wIsshow: lmShow,
        wType: lmModel
    }

    $.ajax({
        type: "POST",
        url: url,
        contentType: "application/json",
        dataType: "text",
        data:  JSON.stringify(reqBody),
        success: function (data) {
            debugger
            alert(data.status)
        }
    });
}