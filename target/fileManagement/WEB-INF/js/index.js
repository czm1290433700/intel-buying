/**
 * 
 */
$(function(){
	$("body").fadeIn(1000);
	$(".pic-module").mouseenter(function(){
		$(this).addClass("pic-border");
	})
	$(".pic-module").mouseleave(function(){
		$(this).removeClass("pic-border");
	})
	$(".team-pic").mouseenter(function(){
		$(this).children(".team-information").animate({top:'0px'},"fast");
	})
	$(".team-pic").mouseleave(function(){
		$(this).children(".team-information").animate({top:'-150px'},"fast");
	})
})