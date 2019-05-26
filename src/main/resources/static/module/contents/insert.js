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
            layer.alert("我进来了");
            var jsonData = JSON.parse(data);
            debugger
            if(jsonData.status == 200){
                layer.alert("添加成功");
                window.location.href = "list";
            }
        }
    });
}

function toUpdate(){
    //上级栏目ID
    var pid = $("#pid").val();
    var id = $("#columnId").val();
    //栏目名称
    var lmName = $("#lmName").val();
    //栏目模型
    var lmModel = $("#lmModel").val();
    //访问路径
    var lmPath = $("#lmPath").val();
    //是否显示
    var lmShow = $("#lmShow").val();

    var url = "/column/modification";

    var reqBody = {
        wId: id,
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
            var jsonData = JSON.parse(data);
            debugger
            if(jsonData.status == 200){
                window.location.href = "list";
            }
        }
    });
}

function toDelete(item,index){
    var url = "/column/delete?id="+item;
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