function getUserId(id) {
  return new Promise((resolve, reject) => {
    console.log("Getting user from database");
    resolve({
      id: 101,
      name: "Sanul",
    });
  });
}

function getBlogPosts(username) {
  return new Promise((resolve, reject) => {
    console.log("connecting to facebook to load posts for user" + username);
    resolve(["post1", "post2", "post3"]);
  });
}

function getComments(posts) {
  return new Promise((resolve, reject) => {
    console.log("connecting to facebook to load comments");
    resolve(["comments for " + posts]);
  });
}

function getCommentsStar(comments) {
  return new Promise((resolve, reject) => {
    console.log("connecting to facebook to load stars on " + comments);
    resolve(["stars: 4"]);
  });
}

getUserId(101)
  .then((blogPosts) => getBlogPosts(user.name))
  .then((comments) => getComments(blogPosts[0]))
  .then((stars) => getCommentsStar(comments))
  .catch((err) => console.log(err));
