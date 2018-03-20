$(function () {
    $("#jqGrid").jqGrid({
        url: '../sys/log/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', width: 30, key: true },
			{ label: '用户名', name: 'username', width: 50 }, 			
			{ label: '用户操作', name: 'operation', width: 70 }, 			
			{ label: '请求方法', name: 'method', width: 150 }, 			
			{ label: '请求参数', name: 'params', width: 80 }, 			
			{ label: 'IP地址', name: 'ip', width: 70 }, 			
			{ label: '创建时间', name: 'createDate', width: 90,editable:false,formatter:function(cellvalue, options, rowObject){
                    if(cellvalue==null ||cellvalue==""){return ""}
                    var time = new Date(cellvalue);
                    return time.getFullYear()+"-"
                        +(time.getMonth()<9?("0"+(time.getMonth()+1)):(time.getMonth()+1))+"-"
                        +(time.getDate()<10?("0"+time.getDate()):(time.getDate()))+" "
                        +(time.getHours()<10?("0"+time.getHours()):(time.getHours()))+":"
                        +(time.getMinutes()<10?("0"+time.getMinutes()):(time.getMinutes()))+":"
                        +(time.getSeconds()<10?("0"+time.getSeconds()):(time.getSeconds()));
                }}
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: false,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		q:{
			key: null
		},
	},
	methods: {
		query: function () {
			vm.reload();
		},
		reload: function (event) {
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
				postData:{'key': vm.q.key},
                page:page
            }).trigger("reloadGrid");
		}
	}
});