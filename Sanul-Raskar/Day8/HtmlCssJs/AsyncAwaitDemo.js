function getUserId(id) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      console.log("Getting user from database");
      resolve({
        id: 101,
        name: "Sanul",
      });
    }, 500);
  });
}

function getBlogPosts(username) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      console.log("connecting to facebook to load posts for user: " + username);
      resolve(["post1", "post2", "post3"]);
    }, 500);
  });
}

function getComments(posts) {
  return new Promise((resolve, reject) => {
    setInterval(() => {
      //console.log("connecting to facebook to load comments");
      resolve(["comment1", "comment2", "comment3"]);
    }, 500);
  });
}

function getCommentsStar(comments) {
  return new Promise((resolve, reject) => {
    setInterval(() => {
      let stars = [];
      comments.forEach((element) => {
        stars.push(Math.floor(Math.random() * 10));
      });
      resolve(stars);
    }, 500);
  });
}

function getAverage(stars) {
  return new Promise((resolve, reject) => {
    setInterval(() => {
      let total = 0;
      stars.forEach((element) => {
        total += element;
      });
      resolve(total / stars.length);
    }, 500);
  });
}

async function getData() {
  try {
    const user = await getUserId(101);
    const blogPosts = await getBlogPosts(user.name);
    const comments = await getComments(blogPosts[0]);
    const stars = await getCommentsStar(comments);
    const average = await getAverage(stars);
    console.log(user);
    console.log(blogPosts);
    console.log(comments);
    console.log(stars);
    console.log(average);
  } catch (error) {
    console.log(error.message);
  }
}

//getData();

// document.getElementById("submitButton").addEventListener("click", function () {
//     let uname = document.getElementById("uname").value;
//     let uemail = document.getElementById("uemail").value;
//     let ucity = document.getElementById("ucity").value;
//     let upassword = document.getElementById("upassword").value;
//     let upincode = document.getElementById("upincode").value;
//     document.getElementById("result").innerHTML = `${uname} ${uemail} ${ucity} ${upassword} ${upincode}`;
//   });

function validate() {
  let uname = document.getElementById("uname").value;
  let uemail = document.getElementById("uemail").value;
  let ucity = document.getElementById("ucity").value;
  let upassword = document.getElementById("upassword").value;
  let upincode = document.getElementById("upincode").value;

  if (uname == null || uname == "") {
    console.log("invalid name");
    document.getElementById("nameError").innerHTML = "Invalid Name";
    return false;
  } else if (uemail == null || uemail == "") {
    document.getElementById("emailError").innerHTML = "Invalid Email";
    return false;
  } else if (ucity == null || ucity == "") {
    document.getElementById("cityError").innerHTML = "Invalid City";
    return false;
  } else if (upassword == null || upassword.length <= 6 || upassword == "") {
    document.getElementById("passwordError").innerHTML = "Invalid Password";
    return false;
  } else if (upincode == null || upincode.length != 6 || upincode == "") {
    document.getElementById("pincodeError").innerHTML = "Invalid Pincode";
    return false;
  } else {
    document.getElementById(
      "result"
    ).innerHTML = `${uname} ${uemail} ${ucity} ${upassword} ${upincode}`;
    //return true;
  }
}
