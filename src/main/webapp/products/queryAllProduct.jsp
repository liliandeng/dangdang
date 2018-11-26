<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/css.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/easyui.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/icon.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui-lang-zh_CN.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>

    <script type="text/javascript" src="${pageContext.request.contextPath}/admin/js/global/js.js"></script>
    <script type="text/javascript">

        $(function () {
            // 分页查询图书
            $("#prodatagrid").datagrid({
                url: "${pageContext.request.contextPath}/ByPage",
                pagination: true,
                title: "图书列表",
                fitColumns: true,//自适应宽度，防止水平滚动,
                columns: [[
                    {checkbox: true, field: 'sss'},
                    {title: "id", field: "id", hidden: "true"},
                    {title: "书名", field: "name", width: 150},
                    {
                        title: "图书封面", field: "productimg", width: 100, formatter: function (value, row, index) {
                            return "<img width='40%' height='45px' src='${pageContext.request.contextPath}/productImages/" + row.productimg + "'/>";
                        },
                    },
                    {title: "原价", field: "price", width: 100},
                    {title: "出版社", field: "press", width: 150},
                    {title: "作者", field: "author", width: 150},
                    {title: "类型", field: "cate.cname", width: 150}

                ]],
                width: 1000,
                toolbar: "#buttonDiv",
                //双击修改开始
                //rowData表示数据，rowindex
                onDblClickRow: function (rowIndex, rowData) {
                    //修改框中展示数据
                    // $("#updateId").val(rowData.id);
                    $("#proName").val(rowData.name);
                    $("#proPrice").val(rowData.price);
                    $.ajax({
                        url: "${pageContext.request.contextPath}/selectCateAll",
                        async: false,
                        success: function (data) {
                            console.log(data);
                            var list = data.list;

                            for (var i = 0; i < list.length; i++) {
                                //alert(ilist[i].o_option+ilist[i].o_id);
                                $("#prosele").append("<option value='" + list[i].cid + "'>" + list[i].cname + "</option>");
                                if (i + 1 == list.length) {
                                    $("#updateProdia").dialog({
                                        closed: false,
                                    });
                                }
                            }

                        },
                        //dataType:"json"
                    });

                    //打开
                    // $("#updateProdia").dialog("open",true);
                },
                //双击修改====结束======


            })
            // 分页查询图书=====END====

            $("#addProdia").dialog({
                width: 600,
                height: 500,

            });
            //添加对话框开始
            $("#addProdia").dialog({
                title: "添加对话框",
                width: 600,
                //closed:true,

            });
            //添加对话框=====结束=====

            //点击打开添加对话框
            $("#addButton").click(function () {
                //对div进行操作
                $("#addProdia").dialog("open", true);
                $.ajax({
                    url: "${pageContext.request.contextPath}/selectCateAll",
                    async: false,
                    success: function (data) {
                        console.log(data);
                        var list = data.list;

                        for (var i = 0; i < list.length; i++) {
                            //alert(ilist[i].o_option+ilist[i].o_id);
                            $("#prosele1").append("<option value='" + list[i].cid + "'>" + list[i].cname + "</option>");
                            if (i + 1 == list.length) {
                                $("#addProdia").dialog({
                                    closed: false,
                                });
                            }
                        }

                    },
                    //dataType:"json"
                });
            });
            //点击打开添加对话框====结束=======
        });


        //批量删除开始
        function doDelete() {
            //获取到所有选中的行：通过datagrid的getSelections方法获取到
            var array = $("#prodatagrid").datagrid("getSelections");
            // alert(array+"diyige");
            if (array.length == 0) {
                $.messager.alert("提示框", "请选中要删除的数据", "warning");
            } else {
                $.messager.confirm("确认框", "确认真的要删除选中的内容吗？", function (result) {
                    if (result) {
                        var ids = new Array(array.length);
                        //alert(ids+"dierge");
                        console.log(ids);
                        for (var i = 0; i < array.length; i++) {
                            ids[i] = array[i].id;
                        }
                        //2.发送ajax请求到后台，执行删除操作
                        $.ajax({
                            url: "${pageContext.request.contextPath}/delete",
                            //data:"ids="+ids,
                            data: {"ids": ids},//这样写发送到后台的参数名是ids[]
                            //在使用json格式的数据作为参数往后台传递的时候，
                            //数组数据会被jquery做进一步的处理===>key[]作为发送到后台的参数名
                            //jquery的深度序列化
                            //不让jquery做深度序列化
                            traditional: true,

                            success: function (data) {
                                // alert(data+"disange");
                                if (data) {
                                    //alert("删除成功");
                                    $.messager.show({
                                        title: "删除提示",
                                        msg: "删除成功",
                                        showSpeed: 2000,
                                        showType: "fade"
                                    });
                                    $("#prodatagrid").datagrid("reload", true);

                                } else {
                                    alert("删除失败");
                                }
                            }
                        });
                    }
                });
            }
        };
        //批量删除======结束======


    </script>


</head>
<body>
<table id="prodatagrid"></table>
<div id="addProdia" class="easyui-dialog" data-options="closed:true">
    <form id="prof1" style="margin:30px" method="post" action="${pageContext.request.contextPath}/add.do">
        <table>
            <tr>
                <td>
                    图书名字：<input class="easyui-validatebox" name="name"
                                data-options="required:true,missingMessage:'请填写商品名字'"/><br/><br/>
                    <%--图书封面：<input class="easyui-filebox" name="uploadFile" data-options="required:true,missingMessage:'请选择封面'"/><br/><br/>--%>
                </td>
                <td>
                    图书原价：<input id="pricess" class="easyui-validatebox" name="price" type="number" step="0.1"
                                data-options="required:true,missingMessage:'请输入价格'"/> <br/><br/>
                </td>
            </tr>
            <tr>
                <td>
                    类别所属：<select id="prosele1" name="cid"></select><br/><br/>
                </td>
            </tr>
        </table>
        <center>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" onClick="pro1()">确认</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel">取消</a>
        </center>
        <input type="submit" value="添加">
    </form>
</div>


<div id="updateProdia" class="easyui-dialog" data-options="closed:true">
    <form id="prof2" style="margin:30px" method="post" action="update">
        <%--enctype="multipart/form-data" 文件上传--%>
        <table>
            <tr>
                <td>
                    <input id="proId" name="book_id" type="hidden"/>
                    图书名字：<input class="easyui-validatebox" id="proName" name="book_name"
                                data-options="required:true,missingMessage:'请填写商品名字'"/><br/><br/>
                    <%--	图书封面：<input class="easyui-filebox"  name="uploadFile" data-options="required:true,missingMessage:'请选择封面'"/><br/><br/>--%>
                </td>
                <td>
                    图书原价：<input class="easyui-validatebox" id="proPrice" name="book_price" type="number" step="0.1"
                                data-options="required:true,missingMessage:'请输入价格'"/> <br/><br/>

                </td>
            </tr>
            <tr>
                <td colspan="2"><p id="image"></p></td>
            </tr>

            <tr>
                <td>
                    类别所属：<select id="prosele" name="cid"></select><br/><br/>
                </td>
            </tr>
        </table>
        <center>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" onClick="pro();">确认</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onClick="exit();">取消</a>
        </center>
        <input type="submit" value="修改">
    </form>
</div>
<!--菜单栏按钮  -->
<div id="buttonDiv">
    <a href="JavaScript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add'" id="addButton">添加</a>
    <a href="JavaScript:void(0)" class="easyui-linkbutton" onclick="doDelete()" data-options="iconCls:'icon-remove'">批量删除</a>
</div>
<!--菜单栏按钮 ===结束 =======-->
</body>
</html>

