class ShoppingList
{

items={};

add_item_to_obj(data)
{	
	this.items[data.name]=data;
}

remove_item_from_obj(data)
{
	//need to be coded
}

add_to_list(data,qty)
{	
	console.log(this.items)
	let list=document.getElementById('shopping_list');
	let holder=document.createElement('div');
	let total_cost=data['price_per_unit']*qty;
	holder.textContent=data['name']+' '+qty+' '+total_cost;
	list.append(holder);
	this.add_item_to_obj(
			{'name':data['name'],'qty':qty,'total':total_cost}
			);
}

send_to_server()
{
	//write code here
}

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
	add_button.textContent="Add";
	add_button.addEventListener('click',()=>{	
							let shopping_list= new ShoppingList();
							let qty=Number(qty_input.value);
							console.log(typeof qty,qty,);
							const MAX_QTY=100000;
							if (qty && !isNaN(qty) && qty<MAX_QTY){
							shopping_list.add_to_list(item_data,qty);
							}

						})

	//add text and button to input holder
	input_holder.appendChild(qty_input);
	input_holder.appendChild(add_button);
	
	//add image_holder and input_holder to box
	box.append(image_holder);
	box.append(input_holder);
	
	return box
}

//###############################################################################################################################################
data={
	'img':'',
	'name':'Apple',
	'price_per_unit':50,
	'unit':'Kg'
	}

items=[data,data,data,data];

let item_store=document.getElementById('item-store');

for (data of items)
{
	item_store.append(create_item(data));
}
