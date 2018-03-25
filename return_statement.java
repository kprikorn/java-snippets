//You're allowed to have more than one return statement, so it's legal to write

if (some_condition) {
  return true;
}
return false;

//It's also unnecessary to compare boolean values to true or false, so you can write

if (verifyPwd())  {
  // do_task
}


//Sometimes you can't return early because there's more work to be done. In that case you can declare a boolean variable and set it appropriately inside the conditional blocks.

boolean success = true;

if (some_condition) {
  // Handle the condition.
  success = false;
} else if (some_other_condition) {
  // Handle the other condition.
  success = false;
}
if (another_condition) {
  // Handle the third condition.
}

// Do some more critical things.

return success;
