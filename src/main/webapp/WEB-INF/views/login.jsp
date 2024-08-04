<!doctype html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Login</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com"></script>
    <img>
</head>
<body class="bg-slate-100">
    <div class="flex flex-col justify-center lg:px-8 min-h-full px-6 py-12">
        <div class="mt-5 mx-auto max-w-sm w-full">
            <form class="bg-white overflow-hidden p-10 rounded-xl shadow-lg space-y-6" th:action="@{/login}" method="post">

                <div class="sm:mx-auto sm:w-full sm:max-w-sm">
                    <img class="mx-auto h-20 w-auto" th:src="@{/images/logo.png}">
                </div>

                <h4 class="font-bold leading-9 mt-10 text-center text-gray-900 text-xl tracking-tight">Sign in to your account</h4>

                <div th:if="${param.error}" class="bg-rose-100 justify-center p-4 ring-1 ring-rose-200 rounded-md">
                    <p>Username and Password Mismatch</p>
                </div>

                <div>
                    <label class="block text-sm font-medium leading-6 text-gray-900" for="username">Username</label>
                    <div class="mt-2">
                        <input class="ring-1 block w-full rounded-md py-1.5 text-gray-900 shadow-sm border-0 ring-inset ring-gray-300 px-3 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6" id="username" name="username" type="text" placeholder="Username">
                    </div>
                </div>

                <div>
                    <label class="block text-sm font-medium leading-6 text-gray-900" for="password">Password</label>
                    <div class="mt-2">
                        <input class="ring-1 block w-full rounded-md py-1.5 text-gray-900 shadow-sm border-0 ring-inset ring-gray-300 px-3 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6" id="password" name="password" type="password" placeholder="Password">
                    </div>
                </div>

                <div>
                    <input class="bg-indigo-600 px-3 py-1.5 text-sm font-semibold leading-6 text-white flex w-full justify-center rounded-md  shadow-sm ring-1 ring-inset hover:bg-indigo-500 focus-visible:outline focus-visible:outline-offset-2 focus-visible:outline-indigo-600" type="submit" value="Log in">
                </div>

            </form>
        </div>
    </div>
</body>
</html>