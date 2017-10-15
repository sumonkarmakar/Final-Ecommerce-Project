 package com.ecommerce2.ecommercebackend.TestCase;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecommerce2.ecommercebackend.Dao.CartDao;
import com.ecommerce2.ecommercebackend.Dao.CartItemDao;
import com.ecommerce2.ecommercebackend.Dao.OrderDao;
import com.ecommerce2.ecommercebackend.Dao.UserDao;
import com.ecommerce2.ecommercebackend.model.Cart;
import com.ecommerce2.ecommercebackend.model.Order;
import com.ecommerce2.ecommercebackend.model.User;
//import com.ecommerce2.ecommercebackend.model.User;

public class OrderTestCase {
	@Autowired
	static AnnotationConfigApplicationContext context;
	@Autowired
	static CartDao cartdao;
	@Autowired
	static UserDao userdao;
	@Autowired
	static OrderDao orderDao;
	/*@Autowired
	static OrderItemsDao orderitemDao;*/
	@Autowired
	static CartItemDao cartitemdao;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		cartdao = (CartDao) context.getBean("cartdao");
		userdao = (UserDao) context.getBean("userdao");
		cartitemdao = (CartItemDao) context.getBean("cartitemdao");
		orderDao = (OrderDao) context.getBean("orderdao");
		//orderitemDao= (OrderItemsDao) context.getBean("orderitemDao");
		
	}
	@Test
	public void insertOrder(){
		
	User user = userdao.getById(61);
		Cart cart  = user.getCart();
		//Set<CartItem> list = cart.getCartItem();
		 //CartItem cart = cartitemdao.getById(63);
			//Order order = new Order();
			Order order = new Order();
			order.setOrderQty(cart.getTotalItems());
		//	order.setTotalitem(cart.getTotalPrice());
			order.setUser(user);
			//order.setId(54);
			
			Assert.assertEquals(true, orderDao.insert(order));
		}
	}

