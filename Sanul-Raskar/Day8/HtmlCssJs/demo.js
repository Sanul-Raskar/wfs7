// document.write("Welcome to the world of JavaScript");

// var a = 10;
// var a = "Hello";

// console.log(a);

// alert(a);

// function demo(){
//     alert("Demo1"+a)
//     window.b=20;
// }

// function demo2(){
//     alert("Demo2"+a)
//     alert(b);
// }

// demo()
// demo2()

// var a = 10;
// if(a < 11){
//     document.write("Value less than 11");
// }

// function promptDemo(){
//     var a = prompt("Enter a value");
//     document.getElementById("demo").innerHTML = `Value ${a}`;
//     if(a < 11){
//         document.write("Value less than 11");
//     }
// }

//promptDemo()

// console.log(document.getElementsByTagName("p").length);
// var para = document.getElementsByTagName("p");

// para[1].innerHTML = "Updated Para 2";

// function promptDemo() {
//   var userGrade = prompt("Enter the grade");
//   document.getElementById("demo").innerHTML = `Grade entered: ${userGrade}`;
//   switch (userGrade) {
//     case "A":
//       alert("Grade is A");
//       break;
//     case "B":
//       alert("Grade is B");
//       break;
//     case "C":
//       alert("Grade is C");
//       break;
//     case "D":
//       alert("Grade is D");
//       break;

//     default:
//       alert("Grade is F");
//       break;
//   }
// }

// promptDemo();
// function hello(){
//     alert("Hi!");
// }

emp = {
  id: 1,
  name: "Sanul",
  city: "Shirur",
};

// document.write(`${emp.id} ${emp.name} ${emp.city}`);

// var emp1 = new Object();
// emp1.id = 23;
// emp1.name = "test";
// document.write("<br/>");
// document.write(`${emp1.id} ${emp1.name} ${emp1.city}`);

function emp3(id, name, city) {
  this.id = id;
  this.name = name;
  this.city = city;
  this.changeCity = (newCity) => {
    this.city = newCity;
  };
}

// var myemp = new emp3(45, "hello", "pune");
// document.write("<br/>");
// document.write(`${myemp.id} ${myemp.name} ${myemp.city}`);

// myemp.changeCity("Delhi");
// document.write("<br/>");
// document.write(`${myemp.id} ${myemp.name} ${myemp.city}`);

document.getElementById("submitButton").addEventListener("click", function () {
  let uid = document.getElementById("uid").value;
  let uname = document.getElementById("uname").value;
  let ucity = document.getElementById("ucity").value;
  document.getElementById("result").innerHTML = `${uid} ${uname} ${ucity}`;
});

const getBlogPost = (callBackFunc) => {
  setTimeout(() => {
    callBackFunc({
      title: "Welcome to the world of JavaScript",
    });
  }, 2000);
};

const getPosts = getBlogPost((blogpost) => {
  console.log(blogpost.title);
});

function getUserId(id, callbackFunc) {
  console.log("Getting user from database");
  callbackFunc({
    id: 101,
    name: "Sanul",
  });
}

function getBlogPosts(username, callbackFunc) {
  console.log("connecting to facebook to load posts");
  callbackFunc(["post1", "post2", "post3"]);
}

function getComments(posts, callbackFunc) {
  console.log("connecting to facebook to load comments");
  callbackFunc(["comments for " + posts]);
}

function getCommentsStar(comments, callbackFunc) {
  console.log("connecting to facebook to load stars on " + comments);
  callbackFunc(["stars: 4"]);
}

getUserId(101, (user) => {
  getBlogPosts(user.name, (blogposts) => {
    getComments(blogposts[0], (comments) => {
      getCommentsStar(blogposts[0], (comments) => {
        console.log(`${user.name} ${blogposts[0]} ${comments}`);
      });
    });
  });
});
