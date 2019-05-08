function myPageInit(type)
{
    alert ('myPageInit' );
    alert ('type=' + type);
}

function mySaveRecord()
{
    alert ('mySaveRecord' );
    return true;
}

function myValidateField(type, name, linenum)
{
    if (name === 'custentity_my_custom_field' )
    {
        alert ('myValidateField' );
        alert ('type=' + type);
        alert ('name=' + name );
        alert ('linenum=' + linenum);
        return true;
    }
}
function myFieldChanged(type, name, linenum)
{
    alert ('myFieldChanged' );
    alert ('type=' + type);
    alert ('name=' + name );
    alert ('linenum=' + linenum);
}

function myPostSourcing(type, name )
{
    alert ('myPostSourcing' );
    alert ('type=' + type);
    alert ('name=' + name );
}

function myLineInit(type)
{
    alert ('myLineInit' );
    alert ('type=' + type);
}

function myValidateLine(type)
{
    alert ('myValidateLine' );
    alert ('type=' + type);
    return true;
}
function myValidateInsert(type)
{
    alert ('myValidateInsert' );
    alert ('type=' + type);
    return true;

}
function myValidateDelete(type)
{
    alert ('myValidateDelete' );
    alert ('type=' + type);
    return true;
}
function myRecalc(type)
{
    alert ('myRecalc' );
    alert ('type=' + type);
}