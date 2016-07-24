// Valid Palindrome  
// Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

// For example,
// "A man, a plan, a canal: Panama" is a palindrome.
// "race a car" is not a palindrome.

object Solution extends App {
  def solution(x: String): Boolean = g(x) == g(x.reverse)
  def g(x: String): String = x.toLowerCase filter (_.isLetter)
}
