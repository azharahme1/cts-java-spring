package com.shop.service;

import org.springframework.context.ApplicationContextAware;

public abstract class ShoppingServiceImpl implements ApplicationContextAware{

	private ShoppingCart cart;

	// public ShoppingServiceImpl(ShoppingCart cart) {
	// super();
	// this.cart = cart;
	// System.out.println("shopping-cart instance injected to shoppingService");
	// System.out.println("shoppingService instance created..");
	// }

	// private ApplicationContext applicationContext = null;

	// @Override
	// public void setApplicationContext(ApplicationContext arg0) throws
	// BeansException {
	// this.applicationContext = arg0;
	// }

	public void doNewShopping() {
		System.out.println("new-shop....");
		// this.cart = applicationContext.getBean("shopCart",ShoppingCart.class);
		this.cart = getShoppingCart();
	}

	public void doCheckout() {
		System.out.println("checkout...");
		this.cart = null;
	}

	public abstract ShoppingCart getShoppingCart();

}
