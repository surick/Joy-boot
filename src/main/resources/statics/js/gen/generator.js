$(function () {
    $("#jqGrid").jqGrid({
        url: '../sys/generator/list',
        datatype: "json",
        colModel: [			
			{ label: '表名', name: 'tableName', width: 100, key: true },
			{ label: 'Engine', name: 'engine', width: 70},
			{ label: '表备注', name: 'tableComment', width: 100 },
			{ label: '创建时间', name: 'createTime', width: 100,formatter:function(cellvalue, options, rowObject){
                    if(cellvalue==null ||cellvalue==""){return ""}
                    var time = new Date(cellvalue);
                    return time.getFullYear()+"-"
                        +(time.getMonth()<9?("0"+(time.getMonth()+1)):(time.getMonth()+1))+"-"
                        +(time.getDate()<10?("0"+time.getDate()):(time.getDate()))+" "
                        +(time.getHours()<10?("0"+time.getHours()):(time.getHours()))+":"
                        +(time.getMinutes()<10?("0"+time.getMinutes()):(time.getMinutes()))+":"
                        +(time.getSeconds()<10?("0"+time.getSeconds()):(time.getSeconds()));
                } }
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50,100,200],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
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
			tableName: null
		}
	},
	methods: {
		query: function () {
			$("#jqGrid").jqGrid('setGridParam',{ 
                postData:{'tableName': vm.q.tableName},
                page:1 
            }).trigger("reloadGrid");
		},
		generator: function() {
			var tableNames = getSelectedRows();
			if(tableNames == null){
				return ;
			}
			location.href = "../sys/generator/code?tables=" + JSON.stringify(tableNames);
		}
	}
});

