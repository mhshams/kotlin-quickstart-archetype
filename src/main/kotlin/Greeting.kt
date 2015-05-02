package greeting

/**
 * A function to say hello to given user.
 *
 * @param name user name, optional
 * @return greeting string to given user
 *
 */
public fun sayHi(name: String = "World"): String = "Hello $name!"