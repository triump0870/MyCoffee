package com.rohanroy.app.mycoffy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * This app displays an order form ro order coffee.
 */
public class MainActivity extends AppCompatActivity  {
    /**
     * Global quantity variable to keep track of the quantity of coffee.
     */
    private int quantity=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder (View view) {
        String priceMessage = "Free";
        displayCoffeePrice(10);
        displayMessage(priceMessage);

    }
    /**
     * This method is called when the plus button is clicked.
     */
    public void plusQuantity(View view) {
        quantity += 1;
        display(quantity);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void minusQuantity(View view) {
        if (quantity > 0) {
            quantity -= 1;
            display(quantity);
        }
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the price for of the quantity.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(
                R.id.price_text_view
        );
        priceTextView.setText(NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(number));
    }

    /**
     * This method displays the price of coffee on the screen.
     */
    private void displayCoffeePrice(int number) {
        TextView coffeePriceTextView = (TextView) findViewById(
                R.id.coffeePrice_text_view
        );
        coffeePriceTextView.setText(NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(number));
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage(String message) {
        TextView priceTextDisplay = (TextView) findViewById (
                R.id.price_text_view
        );
        priceTextDisplay.setText(message);
    }
}
