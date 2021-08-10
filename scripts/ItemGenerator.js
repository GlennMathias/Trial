items_on_list={}

let add_item_to_obj= function(data)
{
	items_on_list[items_on_list.length+1]=data;
}

let remove_item_from_obj= function(data)
{
	//needed to be coded
}

let add_to_list=function(data,qty)
{
	let list=document.getElementById('shopping_list');
	let holder=document.createElement('div');
	let total_cost=data['price_per_unit']*Number(qty);
	holder.textContent=data['name']+' '+qty+' '+total_cost;
	list.append(holder);
	console.log(list);
	add_item_to_obj(
			{'name':data['name'],'qty':qty,'total':total_cost}
			);
}

let create_item=function(item_data)
{
	//create box container

	let box=document.createElement('div');
	box.class='item';
	
	//create image holder,link image to src
	let image_holder= new Image(130,150);
	image_holder.alt=item_data['name'];
	image_holder['src']=item_data['img'];

	//create input holder
	let input_holder=document.createElement('div');
	
	//create quantity input
	let qty_input=document.createElement('input');
	
	//create add button
	let add_button=document.createElement('button');
	add_button.value="Add";
	add_button.addEventListener('click',(e)=>{
							let qty=qty_input.value;
							console.log(qty_input);
							add_to_list(item_data,qty);

						})

	//add text and button to input holder
	input_holder.appendChild(qty_input);
	input_holder.appendChild(add_button);
	
	//add image_holder and input_holder to box
	box.append(image_holder);
	box.append(input_holder);
	
	return box
}


data={
	'img':'',
	'name':'Apple',
	'price_per_unit':50
	}


let item_store=document.getElementById('item-store');
item_store.append(create_item(data));
