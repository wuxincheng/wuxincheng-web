/**
 * @license Copyright (c) 2003-2014, CKSource - Frederico Knabben. All rights reserved.
 * For licensing, see LICENSE.html or http://ckeditor.com/license
 */

CKEDITOR.editorConfig = function( config ) {
	// Define changes to default configuration here. For example:
	// config.language = 'fr';
	// config.uiColor = '#AADC6E';
	
	/*
	var contextPath = location.pathname;
	var index =contextPath.substr(1).indexOf("/");
	contextPath = contextPath.substr(0,index+1);
	config.baseHref = location.protocol + "//" + location.hostname + contextPath;
	 */
	
	config.height = 500; // 设置高度 
	
	config.language = 'zh-cn'; // zh-cn / en
    config.baseFloatZIndex = 19900;
	
	config.filebrowserBrowseUrl = '/wuxincheng-web/ckfinder/ckfinder.html';    
    config.filebrowserImageBrowseUrl = '/wuxincheng-web/ckfinder/ckfinder.html?type=Images';
    config.filebrowserFlashBrowseUrl = '/wuxincheng-web/ckfinder/ckfinder.html?type=Flash';
	config.filebrowserUploadUrl = '/wuxincheng-web/ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Files';
	config.filebrowserImageUploadUrl = '/wuxincheng-web/ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Images';
	config.filebrowserFlashUploadUrl = '/wuxincheng-web/ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Flash';
	
	// 配置指定字体（自己想要什么字体就配什么字体）
	// config.font_names = '微软雅黑;Arial;宋体;楷体_GB2312;新宋体;黑体;隶书;幼圆;Courier New';
	
	// 设置工具栏可折叠（减少toolbar的占用空间）
	// config.toolbarCanCollapse = true;
	
};

CKEDITOR.on( 'dialogDefinition', function( ev ) {
	// Take the dialog name and its definition from the event data.
	var dialogName = ev.data.name;
	var dialogDefinition = ev.data.definition;

	// Check if the definition is from the dialog we're
	// interested in (the 'image' dialog). This dialog name found using DevTools plugin
	if ( dialogName == 'image' ) {
		// Remove the 'Link' and 'Advanced' tabs from the 'Image' dialog.
		dialogDefinition.removeContents( 'Link' ); //
		dialogDefinition.removeContents( 'advanced' );

		// Get a reference to the 'Image Info' tab.
		var infoTab = dialogDefinition.getContents( 'info' );

		// Remove unnecessary widgets/elements from the 'Image Info' tab.         
		infoTab.remove( 'txtHSpace');
		infoTab.remove( 'txtVSpace');
		infoTab.remove( 'txtBorder');
		infoTab.remove( 'cmbAlign' );
        infoTab.remove( 'ratioLock' );
	}
});
