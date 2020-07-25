package process.Model.Cart;

import java.util.List;

public interface CartInterface {
	
	public boolean addToCart(Cart cart);
	public boolean deleteCartItem(Cart cart);
	public boolean updateCart(Cart cart);
	public List<Cart> listCartItems(String username);
	public Cart getCart(int cartId);
}
