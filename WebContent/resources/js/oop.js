function People(name,age,gender,job){
	this.name = name;
	this.age = age;
	this.gneder = gender;
	this.job = job;
}
function Customer(name,age,gender,job,grade,custNo){
	People.call(this);
	this.grade = grade;
	this.custNo = custNo;
}
var info = (()=>{
	let main = ()=>{
		let customer = new Customer('홍길동','25세','남','개발자','3급','123');
		alert(customer.name);
	}
	return {
		main : main
	};
})();



function Product(name, price){
	this.name = name;
	this.price = price;
}
function Food(name, price){
	Product.call(this,name,price);
	this.category = 'food';
}

var app = (()=>{
	return{
		food :()=>{
			alert(new Food('cheese',5).category);
			alert(new Product('cheese',5).name);
		}
	};
})();


var test = (function(){
	var food =()=>{new Food('cheese',5).category;}
	var product =()=>{new Product('cheese',5);}
	return{
		food : food,
		product : product
	};
})();





/*
var inherit = (()=>{
	return {
		main : ()=> {
			let emp1 = new Employee();
			emp1.setSalary("100만원");
			emp1.setPosition("대리");
			alert("직급 , 급여 : "+ emp1.getSalary()+','+emp1.getPosition());
			
			let cust = new Customer();
			cust.setCustNo('1');
			cust.setGrade('골드');
			alert("번호 , 등급 : "+ cust.getCustNo()+','+cust.getGrade());
		}
	};
})();

function Employee(){
	let _salary,_position;
	return {
		setSalary:(salary)=>{this._salary = salary;},
		setPosition : (position)=>{this.position = position;},
		getSalary:()=>{return this._salary;},
		getPosition : ()=>{return this.position;}
	};
}

function Customer(){
	let _custNo, _grade;
	return {
		setCustNo:(custNo)=>{this._custNo = custNo;},
		setGrade : (grade)=>{this._grade = grade;},
		getCustNo:()=>{return this._custNo;},
		getGrade : ()=>{return this._grade;}
	};
}

var app = (function(){
	var main =()=>{
		person.setName('도널드 트럼프 ');
		person.setAge('70');
		person.setGender('남');
		person.setJob('미국 대통령');
		alert('스펙 : '+person.toString());
	}
	return {main:main};
})();
var person =(function(){
	let _name,_age,_gender,_job; 
	return {setName:(name)=>{this._name = name;}, 
		setAge:(age)=>{this._age = age;},
		setGender:(gender)=>{this._gender = gender;},
		setJob:(job)=>{this._job = job;},
		getName:()=>{return this._name;},
		getAge:()=>{return this._age;},
		getGender:()=>{return this._gender;},
		getJob:()=>{return this._job;},
		toString:()=>{
			return this._name + ','+this._age +','+this._gender + ','+this._job}
		};
})();

function Person(name , age , gender , job){
var _= this;
	_name = name;
	_age = age;
	_gender = gender;
	_job = job;
	_toString = ()=>{
		return _name + ','+_age +','+_gender + ','+_job
	}
};


var app = (function(){
	var main = ()=>{
		var person = new Person();
		person.name = '도널드 트럼프 ';
		person.age = '70';
		person.gender = '남';
		person.job = '미국 대통령';
		alert(person);
		console.log(person);
	}
	return {main:main};
}());

var person = (function Person(name , age , gender , job){
	var _= this;
	_name = name;
	_age = age;
	_gender = gender;
	_job = job;
	this.toString = ()=>{
		return _name + ','+_age +','+_gender + ','+_job
	}
})();*/