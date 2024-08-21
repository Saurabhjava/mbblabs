import logo from "./logo.svg";
import "./App.css";
import Product from "./components/Product";
import ProductClass from "./components/ProductClass";
import StateDemoWithClass from "./components/StateDemoWithClass";
import StateWithFunctionDemo from "./components/StateWithFunctionDemo";
import Employee from "./components/Employee";
import "../node_modules/bootstrap/dist/css/bootstrap.min.css"
import Parent from "./components/Parent";
import HowerCounter from "./components/HowerCounter";
import AllEmployee from "./components/employeeComponent/AllEmployee";
import CreateEmployee from "./components/employeeComponent/CreateEmployee";

function App() {
  const products = [
    { pname: "Iphone 13", price: "55000", seller: "xyz infra" },
    { pname: "Samsung c13", price: "45000", seller: "aa infra" },
    { pname: "Moto g 40", price: "30000", seller: "xyz infra" },
    { pname: "RedMe 14", price: "20000", seller: "aa infra" },
  ];
  return (
    <div className="App">
      {/* {products.map((p)=>(
        <ProductClass pname={p.pname} price={p.price} seller={p.seller}></ProductClass>
      ))} */}
      {/* <StateWithFunctionDemo></StateWithFunctionDemo> */}
      {/* <StateDemoWithClass></StateDemoWithClass> */}
      {/* <StateWithFunctionDemo></StateWithFunctionDemo> */}
      {/* <Employee></Employee> */}
      {/* <Parent></Parent> */}
      {/* <HowerCounter></HowerCounter> */}
      <CreateEmployee></CreateEmployee>
    </div>
  );
}

export default App;
