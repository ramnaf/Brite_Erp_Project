package com.briteerp.utilities;

import com.briteerp.pages.*;

public class Pages {

    private LoginPage loginPage;
    private Menu menu;
    private OrderByVendorPage orderByVendorPage;
    private LunchAccountPage lunchAccountPage;
    private EmployeePaymentsPage employeePaymentsPage;
    private AlertPage alertPage;
    private ControlAccountsPage controlAccountsPage;
    private PreviousOrdersPage previousOrdersPage;
    private TodaysOrdersPage todaysOrdersPage;
    private ProductsPage productsPage;
    private ProductCategoriesPage productCategoriesPage;
    private NewOderPage newOderPage;

    //TODO: Dont touch this class please !!!!!!!!!!!

    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public Menu getMenu() {
        if (menu == null) {
            menu = new Menu();
        }
        return  menu;
    }

    public OrderByVendorPage getOrderByVendorPage() {
        if (orderByVendorPage == null) {
            orderByVendorPage = new OrderByVendorPage();
        }
        return orderByVendorPage;
    }

    public LunchAccountPage getLunchAccountPage() {
        if (lunchAccountPage == null) {
            lunchAccountPage = new LunchAccountPage();
        }

        return lunchAccountPage;
    }
    public AlertPage getAlertPage(){
        if(alertPage==null){
            alertPage=new AlertPage();
        }
        return alertPage;
    }
    public ControlAccountsPage getControlAccountsPage(){
        if(controlAccountsPage==null){
            controlAccountsPage=new ControlAccountsPage();
        }
        return controlAccountsPage;
    }
    public PreviousOrdersPage getPreviousOrdersPage(){
        if(previousOrdersPage==null){
            previousOrdersPage=new PreviousOrdersPage();
        }
        return  previousOrdersPage;
    }
    public TodaysOrdersPage getTodaysOrdersPage(){
        if(todaysOrdersPage==null){
            todaysOrdersPage=new TodaysOrdersPage();
        }
        return todaysOrdersPage;
    }

    public EmployeePaymentsPage getPaymentPage(){
        if(employeePaymentsPage==null){
            employeePaymentsPage=new EmployeePaymentsPage();
        }
        return employeePaymentsPage;
    }

    public ProductsPage getProductsPage(){
        if(productsPage==null) {
            productsPage = new ProductsPage();
        }
        return productsPage;
    }

    public ProductCategoriesPage getProductCategoriesPage(){
        if(productCategoriesPage==null){
            productCategoriesPage=new ProductCategoriesPage();
        }
        return productCategoriesPage;
    }

    public NewOderPage getNewOderPage(){
        if(newOderPage==null){
            newOderPage=new NewOderPage();
        }
        return newOderPage;
    }


}