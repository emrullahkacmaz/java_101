import React from 'react'

function UserSignUpPage(){

    return(
        <div>
           <h1> Sign Up</h1>
        <div>
           <label>user name:</label>
           <input onChange={function(event){
               console.log(event.target.value)
           }}></input>
           </div>
           <div>
           <label>email:</label>
           <input></input>
           </div>
           <div>
           <label>password:</label>
           <input type={"password"}></input>
           </div>
           <div>
           <label>password repeat:</label>
           <input type={"password"}></input>
           </div>
           <div>
               <button> Sign Up</button>
           </div>
        </div>
    )
} export default UserSignUpPage;