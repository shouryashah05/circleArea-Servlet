# Circle Area Calculator - Java Servlet Project

## 📌 Assignment Title:
Create a Java servlet that takes input from a web form, calculates the area of a circle based on the provided radius, and displays the result on a web page.

---

## 🎯 Aim:
To create a Java servlet that takes user input for the radius of a circle from a web form, calculates the area, and displays the result dynamically on a web page.

---

## 🧱 Project Setup Instructions

### 🛠️ 1. Create a Dynamic Web Project
1. Open **Eclipse IDE**.
2. Go to **File → New → Dynamic Web Project**.
3. Give the project a name (e.g., `CircleAreaServletApp`).
4. Select **Target Runtime** as **Apache Tomcat v11**.
5. Set the **Dynamic Web Module version** to **5.0 or 6.0** depending on your Eclipse/Tomcat setup.
6. Click **Finish**.

### 📝 2. Create a New Servlet
1. Right-click on **Java Resources → src** → **New → Servlet**.
2. Give it a class name (e.g., `CircleAreaServlet`).
3. Set the **package name** (e.g., `com.circle`).
4. Click **Next**, then optionally define the URL mapping (e.g., `/area`), and click **Finish**.

---

## 🚀 How to Run the Project

### ✅ 1. Start the Tomcat Server
- In Eclipse, go to the **Terminal / Server tab** at the bottom.
- Right-click on **Apache Tomcat v11** → click **Restart** (or **Start** if it's stopped).

---

### ▶️ 2. Run the Project on Server
- Right-click the project folder → **Run As → Run on Server**.
- Choose **Apache Tomcat v11** → click **Finish**.

---

## 🛠️ Troubleshooting: "The selection is not within a valid module" Error

If you encounter this error while trying to run your servlet:

### Step 1: Enable Project Facets
- Right-click your project → **Properties** → go to **Project Facets**.
- Tick ✅ the following:
  - **Dynamic Web Module**
  - **Java**

### Step 2: Set Correct Versions
- If the error continues:
  - Click the **dropdown** next to **Dynamic Web Module**
  - Set the version to **5.0**
  - Click **Apply and Close**

> ⚠️ Note: Tomcat 11 supports Jakarta EE 10, but Eclipse sometimes has compatibility issues. Version 5.0 (Servlet 5.0) is usually safe for most servlet setups.

---

