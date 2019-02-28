function People(name,age,gender,job){
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.job = job;
}
People.prototype.setName =name=>{this.name = name;};
People.prototype.setAge =age=>{this.age = age;};
People.prototype.setGender =gender=>{this.gender = gender;};
People.prototype.setJob =job=>{this.job = job;};

People.prototype.getName =()=>{return this.name;};
People.prototype.getAge =()=>{return this.age;};
People.prototype.getGender =()=>{return this.gender;};
People.prototype.getJob =()=>{return this.job;};

function Customer(grade,custNo){
	People.apply(this,arguments);
	this.grade = grade;
	this.custNo = custNo;
}
Customer.prototype = new People();

//오버라이딩
Customer.prototype.setName =name=>{
	//this.name ='[닉네임] '+name 이건 자바문법
	Object.getPrototypeOf(Customer.prototype).setName('[닉네임] '+name);
};

Customer.prototype.setGrade = (grade)=>{this.grade = grade;};
Customer.prototype.setCustNo = (custNo)=>{this.custNo = custNo;};

Customer.prototype.getGrade = ()=>{return this.grade;};
Customer.prototype.getCustNo = ()=>{return this.custNo;};


var info = (()=>{
	let main = ()=>{
		let cust = new Customer();
		cust.setName('홍길동');
		cust.setAge('25세');
		cust.setGender('남');
		cust.setJob('개발자');
		cust.setGrade('3급');
		cust.setCustNo('123');
		alert('고객 정보 '+'\n'+
				cust.getName()+'\n'+cust.getAge()+'\n'+
				cust.getGender()+'\n'+cust.getJob()+'\n'+
				cust.getGrade()+'\n'+cust.getCustNo());
	}
	return {main : main};
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