#Colorator#
Colorator is short form for "color generator". It is mainly written in PHP,
but there is a good use of HTML, CSS and JavaScript to add more interactivity.

##Features##
Many features are yet to be implemented. This application or script (whatever
you say) will be able to perform all these tasks when it is complete.
 * Get different colors on each reload.
 * Right click to reload.
 * Left click to copy the hexadecimal value of the color to clipboard.
 * Generate different shades of color on an click.

##Tips##
Adding this line to your .htaccess file will let you view PHP files without
typing the extension in the address bar.

    RewriteEngine on
    RewriteCond %{REQUEST_FILENAME} !-d
    RewriteCond %{REQUEST_FILENAME}\.php -f
    RewriteRule ^(.*)$ $1.php

You will be able to type `http://foo.com/bar` to get the actual page
`http://foo.com/bar.php`.
