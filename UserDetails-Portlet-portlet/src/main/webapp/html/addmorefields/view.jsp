<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
 <script type="text/javascript">
$(document).ready(function(){
	var addButton = $('.add_button'); //Add button selector
    var wrapper = $('.field_wrapper'); //Input field wrapper
    var x = 1; //Initial field counter is 1
    $(addButton).click(function(){ //Once add button is clicked  
    		x++; 
    		var fieldHTML = '<div><input type="text" name="field_name'+x+'" value=""/><a href="javascript:void(0);" class="remove_button" title="Remove field"><img src="<%=request.getContextPath()%>/image/remove-icon.png"/></a></div>';     		 
            $(wrapper).append(fieldHTML); // Add field html       
    });
    $(wrapper).on('click', '.remove_button', function(e){ //Once remove button is clicked
        e.preventDefault();
        $(this).parent('div').remove(); //Remove field html
        x--; //Decrement field counter
    });
});
</script>
<div class="field_wrapper">
    <div>
        <input type="text" name="field_name1" value=""/>
        <a href="javascript:void(0);" class="add_button" title="Add field"><img src="<%=request.getContextPath()%>/image/add-icon.png"/></a>
    </div>
</div>