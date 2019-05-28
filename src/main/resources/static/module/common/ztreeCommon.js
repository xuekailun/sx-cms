
/* 文本框显示下拉框开始*/
function beforeClick(treeId, treeNode) {
    var check = treeNode;
    return check;
}



function onClick(e, treeId, treeNode) {
    debugger

    var zTree = $.fn.zTree.getZTreeObj("treeDemo1"),
        nodes = zTree.getSelectedNodes(),
        v = "";
    id = "";
    nodes.sort(function compare(a,b){return a.id-b.id;});
    for (var i=0, l=nodes.length; i<l; i++) {
        v += nodes[i].name + ",";
        id += nodes[i].id + ",";
    }
    if (v.length > 0 ) v = v.substring(0, v.length-1);
    if (id.length > 0 ) id = id.substring(0, id.length-1);

    var cityObj = $("#citySel");
    $("#trId").val(id);
    cityObj.attr("value", v);
}

function showMenu() {

    $("#menuContent").css({background:"#F0F6E3",}).slideDown("fast");

    $("body").bind("mousedown", onBodyDown);
}
function hideMenu() {
    $("#menuContent").fadeOut("fast");
    $("body").unbind("mousedown", onBodyDown);
}
function onBodyDown(event) {
    if (!(event.target.id == "menuBtn" || event.target.id == "menuContent" || $(event.target).parents("#menuContent").length>0)) {
        hideMenu();
    }
}