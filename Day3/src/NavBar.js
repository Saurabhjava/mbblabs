import React from "react";
import { Link } from "react-router-dom";

function NavBar() {
  return (
    <div>
      <ul class="nav">
        <li class="nav-item">
          <Link class="nav-link" to={"employee"}>
            Employee
          </Link>
        </li>
        <li class="nav-item">
          <Link class="nav-link" to={"/"}>
            About
          </Link>
        </li>
        <li class="nav-item">
          <Link class="nav-link" to={"product"}>
            Product
          </Link>
        </li>
      </ul>
    </div>
  );
}

export default NavBar;
